package best.hyun.pgrc.type.kukuru

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Noski : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_noski)
    override val type: PET_TYPE
        get() = PET_TYPE.KUKURU
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_noski)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.WIND
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.FIRE
    override val mainElementalValue: Int
        get() = 90
    override val subElementalValue: Int
        get() = 10
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 55
    override val initLvMaxAtk: Int
        get() = 12
    override val initLvMaxDef: Int
        get() = 7
    override val initLvMaxSpd: Int
        get() = 9
    override val maxLvMaxHp: Int
        get() = 1444
    override val maxLvMaxAtk: Int
        get() = 337
    override val maxLvMaxDef: Int
        get() = 195
    override val maxLvMaxSpd: Int
        get() = 257
    override val initLvMinHp: Int
        get() = 42
    override val initLvMinAtk: Int
        get() = 10
    override val initLvMinDef: Int
        get() = 5
    override val initLvMinSpd: Int
        get() = 8
    override val maxLvMinHp: Int
        get() = 1234
    override val maxLvMinAtk: Int
        get() = 299
    override val maxLvMinDef: Int
        get() = 157
    override val maxLvMinSpd: Int
        get() = 226
    override val minAllGrowth: Double
        get() = 4.774
    override val maxAllGrowth: Double
        get() = 5.481
}