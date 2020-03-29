package best.hyun.pgrc.type.kaki

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Taki : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_taki)
    override val type: PET_TYPE
        get() = PET_TYPE.KAKI
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_taki)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.WIND
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.FIRE
    override val mainElementalValue: Int
        get() = 70
    override val subElementalValue: Int
        get() = 30
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 34
    override val initLvMaxAtk: Int
        get() = 8
    override val initLvMaxDef: Int
        get() = 4
    override val initLvMaxSpd: Int
        get() = 6
    override val maxLvMaxHp: Int
        get() = 1312
    override val maxLvMaxAtk: Int
        get() = 317
    override val maxLvMaxDef: Int
        get() = 183
    override val maxLvMaxSpd: Int
        get() = 268
    override val initLvMinHp: Int
        get() = 26
    override val initLvMinAtk: Int
        get() = 6
    override val initLvMinDef: Int
        get() = 3
    override val initLvMinSpd: Int
        get() = 5
    override val maxLvMinHp: Int
        get() = 1105
    override val maxLvMinAtk: Int
        get() = 279
    override val maxLvMinDef: Int
        get() = 145
    override val maxLvMinSpd: Int
        get() = 237
    override val minAllGrowth: Double
        get() = 4.684
    override val maxAllGrowth: Double
        get() = 5.391
}