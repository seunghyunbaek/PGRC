package best.hyun.pgrc.type.kaku

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Kaku : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_kaku)
    override val type: PET_TYPE
        get() = PET_TYPE.KAKU
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_kaku)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.WATER
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.EARTH
    override val mainElementalValue: Int
        get() = 70
    override val subElementalValue: Int
        get() = 30
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 38
    override val initLvMaxAtk: Int
        get() = 9
    override val initLvMaxDef: Int
        get() = 6
    override val initLvMaxSpd: Int
        get() = 5
    override val maxLvMaxHp: Int
        get() = 1389
    override val maxLvMaxAtk: Int
        get() = 334
    override val maxLvMaxDef: Int
        get() = 237
    override val maxLvMaxSpd: Int
        get() = 194
    override val initLvMinHp: Int
        get() = 29
    override val initLvMinAtk: Int
        get() = 7
    override val initLvMinDef: Int
        get() = 5
    override val initLvMinSpd: Int
        get() = 4
    override val maxLvMinHp: Int
        get() = 1181
    override val maxLvMinAtk: Int
        get() = 296
    override val maxLvMinDef: Int
        get() = 199
    override val maxLvMinSpd: Int
        get() = 163
    override val minAllGrowth: Double
        get() = 4.660
    override val maxAllGrowth: Double
        get() = 5.367
}