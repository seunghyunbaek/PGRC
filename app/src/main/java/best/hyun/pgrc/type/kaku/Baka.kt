package best.hyun.pgrc.type.kaku

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Baka : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_baka)
    override val type: PET_TYPE
        get() = PET_TYPE.KAKU
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_baka)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.WIND
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.FIRE
    override val mainElementalValue: Int
        get() = 60
    override val subElementalValue: Int
        get() = 40
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 41
    override val initLvMaxAtk: Int
        get() = 10
    override val initLvMaxDef: Int
        get() = 6
    override val initLvMaxSpd: Int
        get() = 6
    override val maxLvMaxHp: Int
        get() = 1352
    override val maxLvMaxAtk: Int
        get() = 340
    override val maxLvMaxDef: Int
        get() = 224
    override val maxLvMaxSpd: Int
        get() = 215
    override val initLvMinHp: Int
        get() = 31
    override val initLvMinAtk: Int
        get() = 8
    override val initLvMinDef: Int
        get() = 5
    override val initLvMinSpd: Int
        get() = 5
    override val maxLvMinHp: Int
        get() = 1144
    override val maxLvMinAtk: Int
        get() = 302
    override val maxLvMinDef: Int
        get() = 186
    override val maxLvMinSpd: Int
        get() = 184
    override val minAllGrowth: Double
        get() = 4.746
    override val maxAllGrowth: Double
        get() = 5.453
}